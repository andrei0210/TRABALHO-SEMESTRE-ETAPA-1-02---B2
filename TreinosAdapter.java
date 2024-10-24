public class TreinosAdapter extends RecyclerView.Adapter<TreinosAdapter.TreinoViewHolder> {
    private List<Treino> treinos;

    public TreinosAdapter(List<Treino> treinos) {
        this.treinos = treinos;
    }

    @NonNull
    @Override
    public TreinoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_treino, parent, false);
        return new TreinoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TreinoViewHolder holder, int position) {
        Treino treino = treinos.get(position);
        holder.nomeTextView.setText(treino.getNome());
        // Outros campos...
    }

    @Override
    public int getItemCount() {
        return treinos.size();
    }

    class TreinoViewHolder extends RecyclerView.ViewHolder {
        TextView nomeTextView;

        TreinoViewHolder(View itemView) {
            super(itemView);
            nomeTextView = itemView.findViewById(R.id.nomeTextView);
        }
    }
}
