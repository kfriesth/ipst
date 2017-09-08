/**
 * Copyright (c) 2016, All partners of the iTesla project (http://www.itesla-project.eu/consortium)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package eu.itesla_project.iidm.ddb.modelica_imp_exp;

import java.io.File;

/**
 * @author Luis Maria Zamarreno <zamarrenolm@aia.com>
 * @author Silvia Machado <machados@aia.es>
 */
public class ModelicaModelExtractor extends ModelicaMainClassExtractor {
    @Override
    public void onStartFile(File file) {
        super.onStartFile(file);
        text = new StringBuilder(8192);
    }

    @Override
    public void onLine(String line) {
        text.append(line);
        text.append(System.getProperty("line.separator"));
    }

    public String getText() {
        return text.toString();
    }

    StringBuilder text;
}
