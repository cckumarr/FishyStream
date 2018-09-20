// author : chandan
package com.chandan;

import org.apache.flink.api.common.serialization.DeserializationSchema;

import java.io.Serializable;
import java.util.Random;

public class Fish implements Serializable, DeserializationSchema<Fish> {
  private int salmon;
  private int tuna;
  private int cod;
  private int plasticBag;
  private int leftshoe;

  public static Fish addFish(int salmon, int tuna,int cod){
    Fish f = new Fish();
    f.salmon = salmon;
    f.tuna = tuna;
    f.cod = cod;
    return f;
  }

  public static  void addFishWithJunk(int salmon, int tuna, int cod, int plasticBag, int leftshoe){

  }

  public static void addRandom(){
    Fish f = new Fish();
    Random r = new Random();
    f.salmon = (int)Math.random()%5;
    f.tuna = (int)Math.random()%3;
    f.cod = (int)Math.random()%2;
  }

  /**
   * Gets plasticBag.
   *
   * @return Value of plasticBag.
   */
  public int getPlasticBag() {
    return plasticBag;
  }

  /**
   * Sets new cod.
   *
   * @param cod New value of cod.
   */
  public void setCod(int cod) {
    this.cod = cod;
  }

  /**
   * Sets new leftshoe.
   *
   * @param leftshoe New value of leftshoe.
   */
  public void setLeftshoe(int leftshoe) {
    this.leftshoe = leftshoe;
  }

  /**
   * Sets new plasticBag.
   *
   * @param plasticBag New value of plasticBag.
   */
  public void setPlasticBag(int plasticBag) {
    this.plasticBag = plasticBag;
  }

  /**
   * Gets tuna.
   *
   * @return Value of tuna.
   */
  public int getTuna() {
    return tuna;
  }

  /**
   * Sets new tuna.
   *
   * @param tuna New value of tuna.
   */
  public void setTuna(int tuna) {
    this.tuna = tuna;
  }

  /**
   * Gets cod.
   *
   * @return Value of cod.
   */
  public int getCod() {
    return cod;
  }

  /**
   * Gets leftshoe.
   *
   * @return Value of leftshoe.
   */
  public int getLeftshoe() {
    return leftshoe;
  }

  /**
   * Gets salmon.
   *
   * @return Value of salmon.
   */
  public int getSalmon() {
    return salmon;
  }

  /**
   * Sets new salmon.
   *
   * @param salmon New value of salmon.
   */
  public void setSalmon(int salmon) {
    this.salmon = salmon;
  }

  @Override
  public String toString() {
    return "com.chandan.Fish{" +
        "salmon=" + salmon +
        ", tuna=" + tuna +
        ", cod=" + cod +
        ", plasticBag=" + plasticBag +
        ", leftshoe=" + leftshoe +
        '}';
  }

}
