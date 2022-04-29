
package punto_A;


public class datoslb {
    
     public String titulo;
     public String autor;
     public String editorial;
     public String capitulos;

    public datoslb(String titulo, String autor, String editorial, String capitulos) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.capitulos = capitulos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) { 
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(String capitulos) {
        this.capitulos = capitulos;
    }


  
}