package br.edu.ifpr.persistproject.connection;

import br.edu.ifpr.persistproject.repository.SellerRepository;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    public static void main(String[] args) {

        SellerRepository repository = new SellerRepository();
        repository.getSellers();

    }

}
