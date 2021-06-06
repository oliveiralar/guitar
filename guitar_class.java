package guitar_store;

public class guitar_class
{

  private String numeroSerie, fabricante, modelo, tipo, madeira;
  private double preco;

  public guitar_class(String string, String string2, String string3, String string4, String string5, int i) {
	// TODO Auto-generated constructor stub
}

public void Guitarra (String numeroSerie, String fabricante, String modelo,
		   String tipo, String madeira, double preco)
  {
    this.numeroSerie = numeroSerie;
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.tipo = tipo;

  }

  public String getNumeroSerie ()
  {
    return numeroSerie;
  }
  public void setNumeroSerie (String numeroSerie)
  {
    this.numeroSerie = numeroSerie;
  }

  public String getFabricante ()
  {
    return fabricante;
  }
  public void setFabricante (String fabricante)
  {
    this.fabricante = fabricante;
  }
  public String getModelo ()
  {
    return modelo;
  }
  public void setModelo (String modelo)
  {
    this.modelo = modelo;
  }

  public String getTipo ()
  {
    return tipo;
  }

  public void setTipo (String tipo)
  {
    this.tipo = tipo;
  }

  public String getMadeira ()
  {
    return madeira;
  }
  public void setMadeira (String madeira)
  {
    this.madeira = madeira;
  }
  public double getPreco ()
  {
    return preco;
  }
  public void setPreco (double preco)
  {
    this.preco = preco;
  }

  public static void main (String[]args)
  {

    guitar_class minhaGuitarra =
      new guitar_class ("01020304", "fender", "telecaster", "elC)trica", "mogno",
		    1500);
    System.out.println (minhaGuitarra.getNumeroSerie ());
    System.out.println (minhaGuitarra.getMadeira ());
    System.out.println (minhaGuitarra.getPreco ());
    System.out.println (minhaGuitarra.getTipo ());

  }

}

