/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula26102021;

/**
 *
 * @author Meu Computador
 */
public class Carro  implements Iveiculo,  Imotor{

    @Override
    public String getNome() {
        return "Sportage";
    }

    @Override
    public String getId() {
        return "1";
    }

    @Override
    public String getModelo() {
        return "Sportage 123";
    }

    @Override
    public String getFabricante() {
        return "Fiat";
    }
    
}
