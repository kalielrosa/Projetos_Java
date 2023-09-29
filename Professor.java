public class Professor {

    //Atributos
    private int matricula;
    private String nome;
    private String departamento;

    //Construtor
    public Professor(int matricula, String nome, String departamento){
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }
    
    //Métodos
    public int getMatricula(){
       return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome(){
       return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String toString(){
        return " Matricula: " + this.matricula + " Nome: " + this.nome;
    }

}

