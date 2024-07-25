package com.example.javafxtableexample;

import data.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TableColumn<Product, String> ProductID;
    @FXML
    private TableColumn<Product, String> ProductName;
    @FXML
    private TableColumn<Product, String> ProductCategory;
    @FXML
    private TableColumn<Product, String> ProductPrice;
    @FXML
    private TableView<Product> tvProducttable;

    ObservableList<Product> products = FXCollections.observableArrayList();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        products.add(new Product("1", "Steak", "Meat", "0"));
    }

    @FXML
    public void initialize() {
        tvProducttable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        ProductID.setCellValueFactory(new PropertyValueFactory<>("id"));
        ProductName.setCellValueFactory(new PropertyValueFactory<>("name"));
        ProductCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
        ProductPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        initializeTable();
    }

    private void initializeTable() {

        products.add(new Product("1", "Apfel", "Fruits", "1"));
        products.add(new Product("1", "Banane", "Fruits", "1,50"));
        products.add(new Product("1", "Papaya", "Fruits", "4"));

        tvProducttable.setItems(products);
    }
}