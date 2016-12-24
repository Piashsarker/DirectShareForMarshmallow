package com.ptlearnpoint.www.directshareformarshmallow;

import android.widget.TextView;

/**
 * Created by PT on 12/25/2016.
 */

public class ContactViewBinder {
    public static void bind(Contact contact, TextView textView) {
        textView.setText(contact.getName());
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(contact.getIcon(), 0, 0, 0);
    }
}
