public class AtletasActivity extends AppCompatActivity {
    private RecyclerView atletasRecyclerView;
    private Button addAtletaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atletas);

        atletasRecyclerView = findViewById(R.id.atletasRecyclerView);
        addAtletaButton = findViewById(R.id.addAtletaButton);

        addAtletaButton.setOnClickListener(v -> {
            startActivity(new Intent(this, AddAtletaActivity.class));
        });

        // Configurar RecyclerView com adaptador
    }
}
