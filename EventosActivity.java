public class EventosActivity extends AppCompatActivity {
    private RecyclerView eventosRecyclerView;
    private Button addEventoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        eventosRecyclerView = findViewById(R.id.eventosRecyclerView);
        addEventoButton = findViewById(R.id.addEventoButton);

        addEventoButton.setOnClickListener(v -> {
            startActivity(new Intent(this, AddEventoActivity.class));
        });

        // Configurar RecyclerView com adaptador
    }
}
