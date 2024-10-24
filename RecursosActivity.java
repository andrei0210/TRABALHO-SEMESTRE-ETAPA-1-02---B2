public class RecursosActivity extends AppCompatActivity {
    private RecyclerView recursosRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursos);

        recursosRecyclerView = findViewById(R.id.recursosRecyclerView);
        // Configurar RecyclerView com adaptador para recursos educacionais
    }
}
