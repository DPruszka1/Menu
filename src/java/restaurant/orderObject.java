/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author JokermanBuilt
 */
public class orderObject {
    private String cpu;
    private String ram;
    private String hdd;
    private String name;
    
    public orderObject(String name, String cpu, String ram, String hdd){
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
