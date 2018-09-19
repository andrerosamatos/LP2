package main;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;

public class CatalogoDeCartasPokemon {

		    private HashSet<SimpleEntry<Integer, CartaPokemon>> catalogo;
		    private int cartaAtual;

		    public CatalogoDeCartasPokemon() {
		        this.catalogo = new HashSet<>();
		        this.cartaAtual = 0;
		    }

		    public void adicionarCarta(CartaPokemon carta) {
		        SimpleEntry<Integer, CartaPokemon> entry = new SimpleEntry<>(cartaAtual, carta);
		        this.catalogo.add(entry);
		        cartaAtual++;
		    }

		    public void removerCarta(int posicao) {
		        HashSet<SimpleEntry<Integer, CartaPokemon>> novoCatalogo = new HashSet<>();
		        for (SimpleEntry<Integer, CartaPokemon> entry : this.catalogo) {
		            if (entry.getKey() != posicao) {
		                novoCatalogo.add(new SimpleEntry<>(entry.getKey() - 1, entry.getValue()));
		            } else if (entry.getKey() <= posicao) {
		                novoCatalogo.add(new SimpleEntry<>(entry.getKey(), entry.getValue()));
		            }
		        }
		        this.catalogo = novoCatalogo;
		        this.cartaAtual--;
		    }

		    public String pegarCarta(int posicao) {
		        for (SimpleEntry<Integer, CartaPokemon> entry : this.catalogo) {
		            return entry.getValue().toString();
		        }
		        return null;
		    }

		    public int tamanho() {
		        return cartaAtual;
		    }

		    @Override
		    public String toString() {
		        String retorno = "";
		        for (int i = 0; i < cartaAtual; i++) {
		            for (SimpleEntry<Integer, CartaPokemon> entry : this.catalogo) {
		                if (entry.getKey() == i) {
		                    return retorno = entry.getValue() + System.lineSeparator();
		                }
		            }
		        }
		        return retorno;
		    }
		    

		}
