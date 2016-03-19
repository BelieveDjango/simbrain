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
package org.simbrain.network.gui.dialogs.neuron.rule_panels;

import java.util.List;

import javax.swing.JTextField;

import org.simbrain.network.core.Neuron;
import org.simbrain.network.core.NeuronUpdateRule;
import org.simbrain.network.gui.dialogs.neuron.AbstractNeuronRulePanel;
import org.simbrain.network.neuron_update_rules.HodgkinHuxleyRule;
import org.simbrain.util.LabelledItemPanel;

/**
 * <b>Hodgkin-Huxley Rule Panel</b> TODO: No Implementation.
 */
public class HodgkinHuxleyRulePanel extends AbstractNeuronRulePanel {

    private JTextField perNaChannels = new JTextField();

    private JTextField perKChannels = new JTextField();

    private JTextField getEna = new JTextField();

    private JTextField getEk = new JTextField();

    // private JTextField ENA = new JTextField();
    //
    // private JTextField Ek = new JTextField();

    /** Main tab for neuron prefernces. */
    private LabelledItemPanel mainTab = new LabelledItemPanel();

    /**
     * Creates HodgkinHuxley preferences panel.
     */
    public HodgkinHuxleyRulePanel() {
        super();
        this.add(mainTab);
        mainTab.addItem("Sodium Channels", perNaChannels);
        mainTab.addItem("Potassium Channels", perKChannels);
        mainTab.addItem("Equilibrium Potential", getEna);
        mainTab.addItem("Equilibrium Potential", getEk);
    }

    /**
     * Populate fields with current data.
     */
    @Override
    public void fillFieldValues(List<NeuronUpdateRule> ruleList) {
        HodgkinHuxleyRule neuronRef = (HodgkinHuxleyRule) ruleList.get(0);

        perNaChannels.setText(Double.toString(neuronRef.getPerNaChannels()));
        perKChannels.setText(Double.toString(neuronRef.getPerKChannels()));
        // ENA.setText(Double.toString(neuronRef.getENA()));

        // //Handle consistency of multiple selections
        // if (!NetworkUtils.isConsistent(ruleList, HodgkinHuxleyNeuron.class,
        // "getTemp")) {
        // tfTemp.setText(NULL_STRING);
        // }

    }

    /**
     * Fill field values to default values for binary neuron.
     */
    public void fillDefaultValues() {
        // HodgkinHuxleyRule neuronRef = new HodgkinHuxleyRule();
        // tfTemp.setText(Double.toString(neuronRef.getTemp()));

    }

    // /**
    // * Called externally when the dialog is closed, to commit any changes
    // made.
    // */
    // public void commitChanges() {
    // for (int i = 0; i < ruleList.size(); i++) {
    // HodgkinHuxleyRule neuronRef = (HodgkinHuxleyRule) ruleList.get(i);
    //
    // // if (!tfTemp.getText().equals(NULL_STRING)) {
    // // neuronRef.setTemp(Double.parseDouble(tfTemp.getText()));
    // // }
    //
    // }
    // }

    @Override
    public void commitChanges(List<Neuron> neuron) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected NeuronUpdateRule getPrototypeRule() {
        // TODO Auto-generated method stub
        return null;
    }


}
