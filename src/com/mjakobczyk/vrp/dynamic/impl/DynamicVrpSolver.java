package com.mjakobczyk.vrp.dynamic.impl;

import com.mjakobczyk.vrp.VrpSolver;
import com.mjakobczyk.vrp.VrpDataProvider;
import com.mjakobczyk.vrp.VrpSolutionProvider;
import com.mjakobczyk.vrp.model.VrpOutput;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * DynamicVrpSolver provides implementation of Dynamic VRP.
 */
public class DynamicVrpSolver extends VrpSolver {

    /**
     * DynamicVrpSolver logger, providing data about runtime behaviour.
     */
    private static final Logger LOG = Logger.getLogger(String.valueOf(DynamicVrpSolver.class));

    @Override
    public Optional<VrpOutput> solve() {
       return super.solve();
    }

    @Override
    protected Logger logger() {
        return LOG;
    }

    /**
     * Constructor of DefaultVrpSolver.
     *
     * @param vrpDataProvider     for data
     * @param vrpSolutionProvider for algorithm implementation
     */
    public DynamicVrpSolver(final VrpDataProvider vrpDataProvider, final VrpSolutionProvider vrpSolutionProvider) {
        super(vrpDataProvider, vrpSolutionProvider);
    }
}
