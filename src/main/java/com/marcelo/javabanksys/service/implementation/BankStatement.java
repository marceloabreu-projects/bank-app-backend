package com.marcelo.javabanksys.service.implementation;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.marcelo.javabanksys.entity.Transaction;
import com.marcelo.javabanksys.entity.User;
import com.marcelo.javabanksys.repository.TransactionRepository;
import com.marcelo.javabanksys.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class BankStatement {
    private TransactionRepository transactionRepository;
    private UserRepository userRepository;
    private static final String FILE = "C:\\Users\\marabreu\\Documents\\BankStatements\\MyStatement.pdf";

    public List<Transaction> generateStatement(String accountNumber, String startDate, String endDate) throws FileNotFoundException, DocumentException {
        LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        List<Transaction> transactionList = transactionRepository.findAll().stream()
                .filter(transaction -> transaction.getAccountNumber().equals(accountNumber))
                .filter(transaction -> transaction.getCreatedAt().isEqual(start))
                .filter(transaction -> transaction.getCreatedAt().isEqual(end)).toList();

        User user = userRepository.findByAccountNumber(accountNumber);
        String customerAccount = user.getFirstName() + " " + user.getOtherName() + " " + user.getLastName();
        //Generating statement
        Rectangle statementSize = new Rectangle(PageSize.A4);
        Document document = new Document(statementSize);
        log.info("setting size of document");
        OutputStream outputStream = new FileOutputStream(FILE);
        PdfWriter.getInstance(document, outputStream);

        //Adding content
        document.open();

        //Title Table
        PdfPTable bankInfoTable = new PdfPTable(1);
        //Banner Bank name
        PdfPCell bankName = new PdfPCell(new Phrase("National Bank"));
        bankName.setBorder(0);
        bankName.setBackgroundColor(BaseColor.BLUE);
        bankName.setPadding(20f);
        //banner bank address
        PdfPCell bankAddress = new PdfPCell(new Phrase("Avenida da República, Lisboa, Portugal"));
        bankAddress.setBorder(0);
        //adding to the table
        bankInfoTable.addCell(bankName);
        bankInfoTable.addCell(bankAddress);

        //Summary Information
        PdfPTable statementInfo = new PdfPTable(2);
        PdfPCell customerInfo = new PdfPCell(new Phrase("Start date: " + startDate));
        customerInfo.setBorder(0);
        PdfPCell statement = new PdfPCell(new Phrase("STATEMENT OF ACCOUNT"));
        statement.setBorder(0);
        PdfPCell stopDate = new PdfPCell(new Phrase("End date: " + endDate));
        stopDate.setBorder(0);
        PdfPCell name = new PdfPCell(new Phrase("Customer name: " + customerAccount));
        name.setBorder(0);
        PdfPCell space = new PdfPCell();
        space.setBorder(0);
        PdfPCell address = new PdfPCell(new Phrase("Customer address: " + user.getAddress()));
        address.setBorder(0);

        //Transactions Table
        PdfPTable transactionsTable = new PdfPTable(4);
        PdfPCell date = new PdfPCell(new Phrase("DATE"));
        date.setBackgroundColor(BaseColor.BLUE);
        date.setBorder(0);
        PdfPCell transactionType = new PdfPCell(new Phrase("TRANSACTION TYPE"));
        transactionType.setBackgroundColor(BaseColor.BLUE);
        transactionType.setBorder(0);
        PdfPCell amount = new PdfPCell(new Phrase("TRANSACTION AMOUNT"));
        amount.setBackgroundColor(BaseColor.BLUE);
        amount.setBorder(0);
        PdfPCell status = new PdfPCell(new Phrase("STATUS"));
        status.setBackgroundColor(BaseColor.BLUE);
        status.setBorder(0);

        transactionsTable.addCell(date);
        transactionsTable.addCell(transactionType);
        transactionsTable.addCell(amount);
        transactionsTable.addCell(status);

        transactionList.forEach(transaction -> {
            transactionsTable.addCell(new Phrase(transaction.getCreatedAt().toString()));
            transactionsTable.addCell(new Phrase(transaction.getTransactionType()));
            transactionsTable.addCell(new Phrase(transaction.getAmount().toString()));
            transactionsTable.addCell(new Phrase(transaction.getStatus()));
        });

        statementInfo.addCell(customerInfo);
        statementInfo.addCell(statement);
        statementInfo.addCell(stopDate);
        statementInfo.addCell(name);
        statementInfo.addCell(space);
        statementInfo.addCell(address);

        document.add(bankInfoTable);
        document.add(statementInfo);
        document.add(transactionsTable);

        document.close();

        return transactionList;
    }

}
