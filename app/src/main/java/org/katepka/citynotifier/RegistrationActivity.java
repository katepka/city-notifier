package org.katepka.citynotifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText getEditTextPasswordRepeat;
    private CheckBox checkBoxAgreement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmailReg);
        editTextPassword = findViewById(R.id.editTextPasswordReg);
        getEditTextPasswordRepeat = findViewById(R.id.editTextPasswordRepeat);
        checkBoxAgreement = findViewById(R.id.checkBoxAgreement);
    }

    /**
     * on click button back to Authorization
     * @param view
     */
    public void onClickBackToAuth(View view) {
        Intent intent = new Intent(this, AuthorizationActivity.class);
        startActivity(intent);
    }

    /**
     *
     * @param view
     */
    public void onClickRegister(View view) {

        String username = editTextUsername.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String passwordRep = getEditTextPasswordRepeat.getText().toString().trim();

        editTextUsername.setError(null);
        editTextEmail.setError(null);
        editTextPassword.setError(null);
        getEditTextPasswordRepeat.setError(null);
        checkBoxAgreement.setError(null);

        if (!username.isEmpty()) {
            if (!email.isEmpty()) {
                if (!password.isEmpty()) {
                    if (!passwordRep.isEmpty() && passwordRep.equals(password)) {
                        if (checkBoxAgreement.isChecked()) {
                            if (checkRegistration(username, email, password)) {
                                Intent intent = new Intent(this, MainActivity.class);
                                intent.putExtra("email", email);
                                intent.putExtra("username", username);
                                startActivity(intent);
                            } else {
                                // TODO: Handle different cases why registration wasn't successful
                                Toast.makeText(this, R.string.warningUnsuccessfulRgistration, Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            checkBoxAgreement.setError("Прочитайте соглашение пользователя!");
                        }
                    } else {
                        getEditTextPasswordRepeat.setError("Пароли должны совпадать");
                    }
                } else {
                    editTextPassword.setError("Придумайте пароль");
                }
            } else {
                editTextEmail.setError("Введите email");
            }
        } else {
            editTextUsername.setError("Введите свое имя или придумайте псевдоним");
        }

    }

    /**
     * Invokes Registration API
     * @param username String user input
     * @param email String user input
     * @param password String user input
     * @return true - if registration is successful
     *         false - if registration isn't successful
     */
    private boolean checkRegistration(String username, String email, String password) {
        // TODO: Add Registration API method invocation
        return true;
    }
}
