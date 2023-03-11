public class Turma {
    private String curso, disciplina;

    public void setCurso(String curso1){
        curso = curso1;
    }

    public String getCurso(){
        return curso;
    }

    public void setDisciplina(String disciplina1){
        disciplina = disciplina1;
    }

    public String getDisciplina(){
        return disciplina;
    }
    
    public void setCurso2(String curso2){
        curso = curso2;
    }

    public void setDisciplina2(String disciplina2){
        disciplina = disciplina2;
    }

    public void exibirMensagem(){
        System.out.println(getCurso());
        System.out.println(getDisciplina());
    }
}