public class AtletasAdapter extends RecyclerView.Adapter<AtletasAdapter.AtletaViewHolder> {
    private List<Atleta> atletas;

    public AtletasAdapter(List<Atleta> atletas) {
        this.atletas = atletas;
    }

    @NonNull
    @Override
    public AtletaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_atleta, parent, false);
        return new AtletaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AtletaViewHolder holder, int position) {
        Atleta atleta = atletas.get(position);
        holder.nomeTextView.setText(atleta.getNome());
        // Outros campos...
    }

    @Override
    public int getItemCount() {
        return atletas.size();
    }

    class AtletaViewHolder extends RecyclerView.ViewHolder {
        TextView nomeTextView;

        AtletaViewHolder(View itemView) {
            super(itemView);
            nomeTextView = itemView.findViewById(R.id.nomeTextView);
        }
    }
}
