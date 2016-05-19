/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author paul
 */
public class Note {
    private int idNote;
    private int idEtudiant;
    private int IdUE;
    private boolean Note;

    public Note(int idEtudiant, int IdUE, boolean Note) {
        this.idEtudiant = idEtudiant;
        this.IdUE = IdUE;
        this.Note = Note;
    }

    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdUE() {
        return IdUE;
    }

    public void setIdUE(int IdUE) {
        this.IdUE = IdUE;
    }

    public boolean isNote() {
        return Note;
    }

    public void setNote(boolean Note) {
        this.Note = Note;
    }

  
    
}
