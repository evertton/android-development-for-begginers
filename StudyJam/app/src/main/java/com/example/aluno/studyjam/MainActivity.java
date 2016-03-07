package com.example.aluno.studyjam;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends ActionBarActivity {

    private int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(createOrderSummary(price));

        Toast.makeText(getApplicationContext(), "Compra concluída!", Toast.LENGTH_SHORT).show();
        quantity = 0;
        display();
    }

    public void incremente(View view) {
        quantity +=1 ;
        display();
    }

    public void decremente(View view) {
        if(quantity > 0)
            quantity -=1 ;
        display();
    }

    private int calculatePrice() {
        return (quantity * 5);
    }

    private String createOrderSummary(int price) {
        String summary = "Name: Kaptain Kunal\n";
        summary += "Quantity: " + quantity + "\n";
        summary += "Total: R$" + price;
        summary += "\nThank you!";

        return summary;
    }

    private void display() {
        TextView quantView = (TextView) findViewById(R.id.quant);

        quantView.setText("" + quantity);
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_price_view);

        orderSummaryTextView.setText(message);
    }

}
