public class TreinosActivity extends AppCompatActivity {
    private RecyclerView treinosRecyclerView;
    private Button addTreinoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treinos);

        treinosRecyclerView = findViewById(R.id.treinosRecyclerView);
        addTreinoButton = findViewById(R.id.addTreinoButton);

        addTreinoButton.setOnClickListener(v -> {
            startActivity(new Intent(this, AddTreinoActivity.class));
        });

        // Configurar RecyclerView com adaptador
    }
}
