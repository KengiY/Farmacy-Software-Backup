/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

public class AggiornaMagazzinoControl {
    private int quantita;
    private String nome;
    private int id;
    
    public AggiornaMagazzinoControl(int id, String nome, int quantita){
        this.id = id;
        this.nome= nome;
        this.quantita= quantita;
    }

    public int getQuantita() {
        return quantita;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
    
    public void InserimentoNelDBMS(){
        
    }
}
