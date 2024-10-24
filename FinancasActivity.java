public class FinancasActivity extends AppCompatActivity {
    private RecyclerView financesRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financas);

        financesRecyclerView = findViewById(R.id.financesRecyclerView);
        // Configurar RecyclerView com adaptador para finanças
    }
}
