public class bank {
    public int numeroConta;
    public String agencia;
    public String nomeUsuario;
    public double saldo = 0;

    public bank () {

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositoInicial(double deposito, double saldo){
        return saldo = saldo + deposito;
    }

    @Override
    public String toString() {
        return "========bank=======" +
                "numero da Conta" + numeroConta +
                ", agencia ='" + agencia + '\'' +
                ", nome do Usuario ='" + nomeUsuario + '\'' +
                ", saldo =" + saldo +
                '}';
    }
}
