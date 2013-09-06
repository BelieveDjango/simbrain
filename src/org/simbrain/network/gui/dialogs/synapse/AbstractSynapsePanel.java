/*
 * Part of Simbrain--a java-based neural network kit
 * Copyright (C) 2005,2007 The Authors.  See http://www.simbrain.net/credits
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.simbrain.network.gui.dialogs.synapse;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.simbrain.network.core.Synapse;
import org.simbrain.network.core.SynapseUpdateRule;
import org.simbrain.util.LabelledItemPanel;

/**
 * <b>AbstractSynapsePanel</b> is the parent class for all panels used to set
 * parameters of specific synapse update rules.
 */
public abstract class AbstractSynapsePanel extends JPanel {

    /** Null string. */
    public static final String NULL_STRING = "...";

    /** The synapse update rules being modified. */
    protected List<SynapseUpdateRule> ruleList;

    /** Main panel. */
    protected LabelledItemPanel mainPanel = new LabelledItemPanel();

    /**
     * Adds an item.
     *
     * @param text label of item to add
     * @param comp component to add
     */
    public void addItem(final String text, final JComponent comp) {
        mainPanel.addItem(text, comp);
    }

    /**
     * Add item label.
     *
     * @param text label to add
     * @param comp component to apply label
     */
    public void addItemLabel(final JLabel text, final JComponent comp) {
        mainPanel.addItemLabel(text, comp);
    }

    /**
     * This method is the default constructor.
     */
    public AbstractSynapsePanel() {
        this.setLayout(new BorderLayout());
        this.add(mainPanel, BorderLayout.CENTER);
    }

    /**
     * Populate fields with current data.
     */
    public abstract void fillFieldValues();

    /**
     * Populate fields with default data.
     */
    public abstract void fillDefaultValues();

    /**
     * Called externally when the dialog is closed, to commit any changes made.
     */
    public abstract void commitChanges();

    
    public abstract void commitChanges(List<Synapse> commitSynapses);
    
    public abstract void commitChanges(Synapse templateSynapse);
    
    /**
     * @return Returns the synapse_list.
     */
    public List<SynapseUpdateRule> getRuleList() {
        return ruleList;
    }

    /**
     * @param ruleList The rule list to set.
     */
    public void setRuleList(final List<SynapseUpdateRule> ruleList) {
        this.ruleList = ruleList;
    }

    /**
     * Add notes or other text to bottom of panel. Can be html formatted.
     *
     * @param text Text to add to bottom of panel
     */
    public void addBottomText(final String text) {
        JPanel labelPanel = new JPanel();
        JLabel theLabel = new JLabel(text);
        labelPanel.add(theLabel);
        this.add(labelPanel, BorderLayout.SOUTH);
    }
}
