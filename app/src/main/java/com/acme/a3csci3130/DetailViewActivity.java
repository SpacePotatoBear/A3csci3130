package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DetailViewActivity extends Activity {

    private EditText nameField, phoneField, addressField, typeField, locationField;
    Contact receivedPersonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        receivedPersonInfo = (Contact)getIntent().getSerializableExtra("Contact");

        nameField = (EditText) findViewById(R.id.bName);
        phoneField = (EditText) findViewById(R.id.pNum);
        addressField = (EditText) findViewById(R.id.address);
        typeField = (EditText) findViewById(R.id.bType);
        locationField = (EditText) findViewById(R.id.location);


        if(receivedPersonInfo != null){
            nameField.setText(receivedPersonInfo.name);
            phoneField.setText(receivedPersonInfo.phone);
            addressField.setText(receivedPersonInfo.address);
            typeField.setText(receivedPersonInfo.type);
            locationField.setText(receivedPersonInfo.location);
        }
    }

    public void updateContact(View v){
        //TODO: Update contact funcionality
    }

    public void eraseContact(View v)
    {
        //TODO: Erase contact functionality
    }
}
