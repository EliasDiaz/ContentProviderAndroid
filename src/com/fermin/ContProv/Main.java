package com.fermin.ContProv;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        Cursor people = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        while (people.moveToNext()) {
			
		}
    }
}