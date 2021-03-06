/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_leonardoborjas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Leonardo Borjas
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        EliminarAl = new javax.swing.JMenuItem();
        ModificarAl = new javax.swing.JMenuItem();
        popup2 = new javax.swing.JPopupMenu();
        EliminarA = new javax.swing.JMenuItem();
        ModificarA = new javax.swing.JMenuItem();
        popup3 = new javax.swing.JPopupMenu();
        Eliminarr = new javax.swing.JMenuItem();
        Modificarr = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        Aprogra2 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        Arusia = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        Aaleman = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Guardar = new javax.swing.JMenuItem();
        Cargar = new javax.swing.JMenuItem();
        Salirr = new javax.swing.JMenuItem();

        EliminarAl.setText("Eliminar");
        EliminarAl.setToolTipText("");
        EliminarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAlActionPerformed(evt);
            }
        });
        popup.add(EliminarAl);

        ModificarAl.setText("Modificar");
        ModificarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAlActionPerformed(evt);
            }
        });
        popup.add(ModificarAl);

        EliminarA.setText("Eliminar");
        EliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAActionPerformed(evt);
            }
        });
        popup2.add(EliminarA);

        ModificarA.setText("Modificar");
        ModificarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAActionPerformed(evt);
            }
        });
        popup2.add(ModificarA);

        Eliminarr.setText("Eliminar");
        Eliminarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarrActionPerformed(evt);
            }
        });
        popup3.add(Eliminarr);

        Modificarr.setText("Modificar");
        Modificarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarrActionPerformed(evt);
            }
        });
        popup3.add(Modificarr);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Programacion II");
        Aprogra2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Aprogra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Aprogra2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Aprogra2);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Rusia");
        Arusia.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Arusia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArusiaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Arusia);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Aleman");
        Aaleman.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Aaleman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AalemanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Aaleman);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Simulación");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jMenu1.add(Guardar);

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        jMenu1.add(Cargar);

        Salirr.setText("Salir");
        Salirr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirrActionPerformed(evt);
            }
        });
        jMenu1.add(Salirr);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void escribir(String path, ArrayList m) {
        File archivo = new File(path);
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            bw.writeObject(m);
            bw.flush();
        } catch (Exception e) {
        }
        try {
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public ArrayList cargar(String path) {
        File archivo = new File(path);
        ArrayList m = new ArrayList();
        try {
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                m = (ArrayList) objeto.readObject();
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
        return m;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String arma = "";
        int poder = 0;
        String apodo = JOptionPane.showInputDialog("Ingrese el apodo del soldado");
        int cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta del soldado"));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del soldado"));

        if (edad >= 16) {

            String grado = JOptionPane.showInputDialog("Ingrese el Grado Academico del soldado");
            int pasar = Integer.parseInt(JOptionPane.showInputDialog("Elija el arma del soldado\n"
                    + "1. Discos Duros (PdF=23)\n2. Controles de Wii (PdF=47)"
                    + "\n3. Laptops (PdF=76)"));

            switch (pasar) {
                case 1:
                    arma = "Discos Duros";
                    poder = 23;
                    break;
                case 2:
                    arma = "Controles de Wii";
                    poder = 47;
                    break;
                case 3:
                    arma = "Laptops";
                    poder = 76;
                    break;
            }

            Alumno alumno = new Alumno(apodo, cuenta, edad, grado, arma, poder);
            alumnos.add(alumno);

            Aprogra2.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Programacion II")));
            DefaultTreeModel m = (DefaultTreeModel) Aprogra2.getModel();
            DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
            for (Alumno a : alumnos) {
                n.add(new DefaultMutableTreeNode(a));
            }
        }else{
            JOptionPane.showMessageDialog(this, "Soldado menor de edad");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String arma = "";
        int poder = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del soldado");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del soldado"));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del soldado"));
        String rango = ("Ingrese el rango del soldado");
        int pasar = Integer.parseInt(JOptionPane.showInputDialog("Elija el arma del soldado\n"
                + "1. AK-47 (PdF=27)\n2. Revolver Navant (PdF=13)"
                + "\n3. RPG-7 (PdF=57)"));
        switch (pasar) {
            case 1:
                arma = "AK-47";
                poder = 27;
                break;
            case 2:
                arma = "Revolver Navant";
                poder = 13;
                break;
            case 3:
                arma = "RPG-7";
                poder = 57;
                break;
        }

        Ruso ruso = new Ruso(nombre, id, edad, rango, arma, poder);
        rusos.add(ruso);

        Arusia.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Rusia")));
        DefaultTreeModel m = (DefaultTreeModel) Arusia.getModel();
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        for (Ruso r : rusos) {
            n.add(new DefaultMutableTreeNode(r));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String arma = "";
        int poder = 0;
        String alias = JOptionPane.showInputDialog("Ingrese el alias del soldado");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del soldado"));
        if (edad>=16) {
            
       
        String casta = JOptionPane.showInputDialog("Ingrese la Casta del soldado");
        int pasar = Integer.parseInt(JOptionPane.showInputDialog("Elija el arma del soldado\n"
                + "1. Subfusil MP 40 (PdF=25)\n2. Ametralladora MG42 (PdF=32)"
                + "\n3. Pistolas Walther P38 (PdF=11)"));
        switch (pasar) {
            case 1:
                arma = "Subfusil MP 40";
                poder = 25;
                break;
            case 2:
                arma = "Ametralladora MG42";
                poder = 32;
                break;
            case 3:
                arma = "Pistolas Walther P38";
                poder = 11;
                break;
        }
        Aleman aleman = new Aleman(alias, edad, casta, arma, poder);
        alemanes.add(aleman);

        Aaleman.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Aleman")));
        DefaultTreeModel m = (DefaultTreeModel) Aaleman.getModel();
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        for (Aleman a : alemanes) {
            n.add(new DefaultMutableTreeNode(a));
        }
        }else{
            JOptionPane.showMessageDialog(this, "Soldado menor de edad");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Aprogra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aprogra2MouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            popup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_Aprogra2MouseClicked

    private void EliminarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAlActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode t = (DefaultMutableTreeNode) Aprogra2.getLastSelectedPathComponent();
        Alumno alumno = (Alumno) t.getUserObject();
        alumnos.remove(alumno);

        Aprogra2.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Programacion II")));
        DefaultTreeModel m = (DefaultTreeModel) Aprogra2.getModel();
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        for (Alumno a : alumnos) {
            n.add(new DefaultMutableTreeNode(a));
        }
    }//GEN-LAST:event_EliminarAlActionPerformed

    private void ModificarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAlActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode t = (DefaultMutableTreeNode) Aprogra2.getLastSelectedPathComponent();
        Alumno alumno = (Alumno) t.getUserObject();
        String arma = "";
        int poder = 0;
        String apodo = JOptionPane.showInputDialog("Ingrese el apodo del soldado");
        int cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta del soldado"));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del soldado"));
        String grado = JOptionPane.showInputDialog("Ingrese el Grado Academico del soldado");
        int pasar = Integer.parseInt(JOptionPane.showInputDialog("Elija el arma del soldado\n"
                + "1. Discos Duros (PdF=23)\n2. Controles de Wii (PdF=47)"
                + "\n3. Laptops (PdF=76)"));

        switch (pasar) {
            case 1:
                arma = "Discos Duros";
                poder = 23;
                break;
            case 2:
                arma = "Controles de Wii";
                poder = 47;
                break;
            case 3:
                arma = "Laptops";
                poder = 76;
                break;
        }
        alumno.setApodo(apodo);
        alumno.setCuenta(cuenta);
        alumno.setEdad(edad);
        alumno.setGrado(grado);
        alumno.setArma(arma);
        alumno.setPoder(poder);

        Aprogra2.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Programacion II")));
        DefaultTreeModel m = (DefaultTreeModel) Aprogra2.getModel();
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        for (Alumno a : alumnos) {
            n.add(new DefaultMutableTreeNode(a));
        }
    }//GEN-LAST:event_ModificarAlActionPerformed

    private void AalemanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AalemanMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            popup2.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_AalemanMouseClicked

    private void EliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode t = (DefaultMutableTreeNode) Aaleman.getLastSelectedPathComponent();
        Aleman aleman = (Aleman) t.getUserObject();
        alemanes.remove(aleman);

        Aaleman.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Aleman")));
        DefaultTreeModel m = (DefaultTreeModel) Aaleman.getModel();
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        for (Aleman a : alemanes) {
            n.add(new DefaultMutableTreeNode(a));
        }
    }//GEN-LAST:event_EliminarAActionPerformed

    private void ModificarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode t = (DefaultMutableTreeNode) Aaleman.getLastSelectedPathComponent();
        Aleman aleman = (Aleman) t.getUserObject();

        String arma = "";
        int poder = 0;
        String alias = JOptionPane.showInputDialog("Ingrese el alias del soldado");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del soldado"));
        String casta = JOptionPane.showInputDialog("Ingrese la Casta del soldado");
        int pasar = Integer.parseInt(JOptionPane.showInputDialog("Elija el arma del soldado\n"
                + "1. Subfusil MP 40 (PdF=25)\n2. Ametralladora MG42 (PdF=32)"
                + "\n3. Pistolas Walther P38 (PdF=11)"));
        switch (pasar) {
            case 1:
                arma = "Subfusil MP 40";
                poder = 25;
                break;
            case 2:
                arma = "Ametralladora MG42";
                poder = 32;
                break;
            case 3:
                arma = "Pistolas Walther P38";
                poder = 11;
                break;
        }
        aleman.setAlias(alias);
        aleman.setEdad(edad);
        aleman.setCasta(casta);
        aleman.setArma(arma);
        aleman.setPoder(poder);

        Aaleman.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Aleman")));
        DefaultTreeModel m = (DefaultTreeModel) Aaleman.getModel();
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        for (Aleman a : alemanes) {
            n.add(new DefaultMutableTreeNode(a));
        }
    }//GEN-LAST:event_ModificarAActionPerformed

    private void EliminarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarrActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode t = (DefaultMutableTreeNode) Arusia.getLastSelectedPathComponent();
        Ruso ruso = (Ruso) t.getUserObject();
        rusos.remove(ruso);

        Arusia.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Rusia")));
        DefaultTreeModel m = (DefaultTreeModel) Arusia.getModel();
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        for (Ruso r : rusos) {
            n.add(new DefaultMutableTreeNode(r));
        }
    }//GEN-LAST:event_EliminarrActionPerformed

    private void ArusiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArusiaMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            popup3.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_ArusiaMouseClicked

    private void ModificarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarrActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode t = (DefaultMutableTreeNode) Arusia.getLastSelectedPathComponent();
        Ruso ruso = (Ruso) t.getUserObject();

        String arma = "";
        int poder = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del soldado");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del soldado"));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del soldado"));
        String rango = ("Ingrese el rango del soldado");
        int pasar = Integer.parseInt(JOptionPane.showInputDialog("Elija el arma del soldado\n"
                + "1. AK-47 (PdF=27)\n2. Revolver Navant (PdF=13)"
                + "\n3. RPG-7 (PdF=57)"));
        switch (pasar) {
            case 1:
                arma = "AK-47";
                poder = 27;
                break;
            case 2:
                arma = "Revolver Navant";
                poder = 13;
                break;
            case 3:
                arma = "RPG-7";
                poder = 57;
                break;
        }
        ruso.setNombre(nombre);
        ruso.setId(id);
        ruso.setEdad(edad);
        ruso.setRango(rango);
        ruso.setArma(arma);
        ruso.setPoder(poder);

        Arusia.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Rusia")));
        DefaultTreeModel m = (DefaultTreeModel) Arusia.getModel();
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        for (Ruso r : rusos) {
            n.add(new DefaultMutableTreeNode(r));
        }
    }//GEN-LAST:event_ModificarrActionPerformed

    private void SalirrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirrActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirrActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        escribir("./Archivos/Alemanes.sota", alemanes);
        escribir("./Archivos/Rusos.sota", rusos);
        escribir("./Archivos/Alumnos.sota", alumnos);
        JOptionPane.showMessageDialog(this, "Soldado menor de edad");
    }//GEN-LAST:event_GuardarActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        // TODO add your handling code here:
        alemanes = cargar("./Archivos/Alemanes.sota");
        rusos = cargar("./Archivos/Rusos.sota");
        alumnos = cargar("./Archivos/Alumnos.sota");

        Arusia.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Rusia")));
        DefaultTreeModel m = (DefaultTreeModel) Arusia.getModel();
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        for (Ruso r : rusos) {
            n.add(new DefaultMutableTreeNode(r));
        }

        Aaleman.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Aleman")));
        m = (DefaultTreeModel) Aaleman.getModel();
        n = (DefaultMutableTreeNode) m.getRoot();
        for (Aleman a : alemanes) {
            n.add(new DefaultMutableTreeNode(a));
        }

        Aprogra2.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Programacion II")));
        m = (DefaultTreeModel) Aprogra2.getModel();
        n = (DefaultMutableTreeNode) m.getRoot();
        for (Alumno a : alumnos) {
            n.add(new DefaultMutableTreeNode(a));
        }
    }//GEN-LAST:event_CargarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int algo = 0;
        do {
            //1-3
            int j = 0;
            if (rusos.isEmpty() || alemanes.isEmpty()) {
            } else {
                for (int i = 0; i < rusos.size(); i++) {

                    if (i >= alemanes.size() - 1) {

                    } else {
                        j = i;
                    }
                    int vidaenemiga = alemanes.get(j).getResistencia();
                    int ataque = rusos.get(i).getPoder();
                    int restante = vidaenemiga - ataque;
                    alemanes.get(j).setResistencia(restante);
                    if (restante <= 0) {
                        alemanes.remove(j);
                    }
                }
            }

            //1-2
            j = 0;
            if (rusos.isEmpty() || alumnos.isEmpty()) {
            } else {
                for (int i = 0; i < rusos.size(); i++) {

                    if (i >= alumnos.size() - 1) {

                    } else {
                        j = i;
                    }
                    int vidaenemiga = alumnos.get(j).getResistencia();
                    int ataque = rusos.get(i).getPoder();
                    int restante = vidaenemiga - ataque;
                    alumnos.get(j).setResistencia(restante);
                    if (restante <= 0) {
                        alumnos.remove(j);
                    }

                }
            }
            //2-3
            j = 0;
            if (alumnos.isEmpty() || alemanes.isEmpty()) {
            } else {
                for (int i = 0; i < alumnos.size(); i++) {

                    if (i >= alemanes.size() - 1) {

                    } else {
                        j = i;
                    }
                    int vidaenemiga = alemanes.get(j).getResistencia();
                    int ataque = alumnos.get(i).getPoder();
                    int restante = vidaenemiga - ataque;
                    alemanes.get(j).setResistencia(restante);
                    if (restante <= 0) {
                        alemanes.remove(j);
                    }
                }
            }

            //2-1
            j = 0;
            if (alumnos.isEmpty() || rusos.isEmpty()) {
            } else {
                for (int i = 0; i < rusos.size(); i++) {

                    if (i >= rusos.size() - 1) {

                    } else {
                        j = i;
                    }
                    int vidaenemiga = rusos.get(j).getResistencia();
                    int ataque = alumnos.get(i).getPoder();
                    int restante = vidaenemiga - ataque;
                    rusos.get(j).setResistencia(restante);
                    if (restante <= 0) {
                        rusos.remove(j);
                    }
                }
            }
            //3-1
            j = 0;
            if (alemanes.isEmpty() || rusos.isEmpty()) {
            } else {
                for (int i = 0; i < rusos.size(); i++) {

                    if (i >= rusos.size() - 1) {

                    } else {
                        j = i;
                    }
                    int vidaenemiga = rusos.get(j).getResistencia();
                    int ataque = alemanes.get(i).getPoder();
                    int restante = vidaenemiga - ataque;
                    rusos.get(j).setResistencia(restante);
                    if (restante <= 0) {
                        rusos.remove(j);
                    }
                }
            }

            //3-2
            j = 0;
            if (alemanes.isEmpty() || alumnos.isEmpty()) {
            } else {
                for (int i = 0; i < alumnos.size(); i++) {

                    if (i >= alumnos.size() - 1) {

                    } else {
                        j = i;
                    }
                    int vidaenemiga = alumnos.get(j).getResistencia();
                    int ataque = alemanes.get(i).getPoder();
                    int restante = vidaenemiga - ataque;
                    alumnos.get(j).setResistencia(restante);
                    if (restante <= 0) {
                        alumnos.remove(j);
                    }
                }
            }

            if (alemanes.isEmpty() && alumnos.isEmpty() && rusos.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Empate");
                algo = 2;
            } else {
                if (alemanes.isEmpty() && alumnos.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ganaron los Rusos");
                    algo = 2;
                }
                if (rusos.isEmpty() && alumnos.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ganaron los Alemanes");
                    algo = 2;
                }
                if (alemanes.isEmpty() && rusos.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ganaron los Alumnos");
                    algo = 2;
                }
            }
        } while (algo < 2);
        Arusia.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Rusia")));
        DefaultTreeModel m = (DefaultTreeModel) Arusia.getModel();
        DefaultMutableTreeNode n = (DefaultMutableTreeNode) m.getRoot();
        for (Ruso r : rusos) {
            n.add(new DefaultMutableTreeNode(r));
        }

        Aaleman.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Aleman")));
        m = (DefaultTreeModel) Aaleman.getModel();
        n = (DefaultMutableTreeNode) m.getRoot();
        for (Aleman a : alemanes) {
            n.add(new DefaultMutableTreeNode(a));
        }

        Aprogra2.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Programacion II")));
        m = (DefaultTreeModel) Aprogra2.getModel();
        n = (DefaultMutableTreeNode) m.getRoot();
        for (Alumno a : alumnos) {
            n.add(new DefaultMutableTreeNode(a));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Aaleman;
    private javax.swing.JTree Aprogra2;
    private javax.swing.JTree Arusia;
    private javax.swing.JMenuItem Cargar;
    private javax.swing.JMenuItem EliminarA;
    private javax.swing.JMenuItem EliminarAl;
    private javax.swing.JMenuItem Eliminarr;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenuItem ModificarA;
    private javax.swing.JMenuItem ModificarAl;
    private javax.swing.JMenuItem Modificarr;
    private javax.swing.JMenuItem Salirr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JPopupMenu popup2;
    private javax.swing.JPopupMenu popup3;
    // End of variables declaration//GEN-END:variables

    ArrayList<Alumno> alumnos = new ArrayList();
    ArrayList<Ruso> rusos = new ArrayList();
    ArrayList<Aleman> alemanes = new ArrayList();
}
