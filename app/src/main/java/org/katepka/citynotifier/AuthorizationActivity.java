package org.katepka.citynotifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AuthorizationActivity extends AppCompatActivity {
    private EditText editTextEmail;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);
        editTextEmail = findViewById(R.id.editTextEmailReg);
        editTextPassword = findViewById(R.id.editTextPasswordReg);
    }

    public void onClickGoToRegistration(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

    /**
     * On click validate input email and password for non-emptiness.
     * If some field is empty invokes a popup error.
     * If they aren't empty it invokes checkAuthorization() method.
     * If it returns true the method starts new activity, if not it shows a toast with an error.
     * @param view
     */
    public void onClickGoToAuthorization(View view) {
        editTextEmail.setError(null);
        editTextPassword.setError(null);

        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (!email.isEmpty()) {
            if (!password.isEmpty()) {
                if (checkAuthorization(email, password)) {
                    Intent intent = new Intent(this, CreateNewActivity.class);
                    intent.putExtra("email", email);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, R.string.warningAccountNotFound, Toast.LENGTH_SHORT).show();
                }
            } else {
                editTextPassword.setError("Введите пароль");
                if (email.isEmpty()) {
                    editTextEmail.setError("Введите email");
                }
            }
        } else {
            editTextEmail.setError("Введите email");
            if (password.isEmpty()) {
                editTextPassword.setError("Введите пароль");
            }
        }
    }

    /**
     * Invokes Authorization API
     * @param email String user input
     * @param password String user input
     * @return true - if authorization is successful
     *         false - if authorization isn't successful
     */
    public boolean checkAuthorization(String email, String password) {
        // TODO: Add Authorization API method invocation
        return true;
    }

}
