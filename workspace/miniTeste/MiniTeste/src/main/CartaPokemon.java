package main;

public class CartaPokemon {
    private String nome;

    public CartaPokemon(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CartaPokemon other = (CartaPokemon) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

	@Override
	public String toString() {
		return nome;
	}
    


}
