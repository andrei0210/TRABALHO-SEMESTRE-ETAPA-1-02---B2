public class DesempenhoActivity extends AppCompatActivity {
    private LineChart performanceChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desempenho);

        performanceChart = findViewById(R.id.performanceChart);
        // Configurar gráfico com dados de desempenho
    }
}
