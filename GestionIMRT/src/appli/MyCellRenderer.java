/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author paul
 */
public class MyCellRenderer extends DefaultTableCellRenderer {
 
        private static final long serialVersionUID = 1L;
 
        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus, int row,
                int column) {
 
            if (value instanceof JComboBox) {
                return (JComboBox) value;
            }
            if (value instanceof Boolean) {
                JCheckBox cb = new JCheckBox();
                cb.setSelected(((Boolean) value).booleanValue());
                return cb;
            }
            if (value instanceof JCheckBox) {
                return (JCheckBox) value;
            }
            return new JTextField(value.toString());
        }
 
    }