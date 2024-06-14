enum Categoria {
    AUXILIAR(40000),
    ASISTENTE(45000),
    ASOCIADO(50000),
    TITULAR(55000);

    private final double valorHora;

    Categoria(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }
}
