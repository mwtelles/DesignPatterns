public abstract class Dev {

    private int cpf;
    protected String nome;
    private float skill1;
    private float skill2;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSkill1() {
        return skill1;
    }

    public void setSkill1(float skill1) {
        this.skill1 = skill1;
    }

    public float getSkill2() {
        return skill2;
    }

    public void setSkill2(float skill2) {
        this.skill2 = skill2;
    }

    public float calcularPromocao() {
        return (this.skill1 + this.skill2) / 2;
    }

    public abstract String verificarPromocao();

    public String getTipo() {
        return "Dev";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "cpf=" + this.cpf +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarPromocao() +
                '}';
    }
}
