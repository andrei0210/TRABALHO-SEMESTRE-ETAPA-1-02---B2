public class LoginActivity extends AppCompatActivity {
    // Componentes
    private EditText emailEditText, senhaEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.email);
        senhaEditText = findViewById(R.id.senha);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String senha = senhaEditText.getText().toString();
            // Autenticação com Firebase
        });
    }
}
