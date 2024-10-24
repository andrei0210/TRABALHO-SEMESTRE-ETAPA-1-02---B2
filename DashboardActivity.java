public class DashboardActivity extends AppCompatActivity {
    private RecyclerView activitiesRecyclerView;
    private Button goToAtletas, goToTreinos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        activitiesRecyclerView = findViewById(R.id.activitiesRecyclerView);
        goToAtletas = findViewById(R.id.goToAtletas);
        goToTreinos = findViewById(R.id.goToTreinos);

        goToAtletas.setOnClickListener(v -> {
            startActivity(new Intent(this, AtletasActivity.class));
        });

        goToTreinos.setOnClickListener(v -> {
            startActivity(new Intent(this, TreinosActivity.class));
        });
    }
}
