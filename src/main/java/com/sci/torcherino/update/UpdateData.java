package com.sci.torcherino.update;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * @author sci4me
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public final class UpdateData {
    public final ModVersion latest;
    public final String description;

    public UpdateData(ModVersion latest, String description) {
        this.latest = latest;
        this.description = description;
    }

    public static UpdateData parse(final String json) {
        final JsonParser parser = new JsonParser();
        final JsonObject root = parser.parse(json).getAsJsonObject();
        return new UpdateData(ModVersion.parse(root.get("version").getAsString()), root.get("description").getAsString());
    }
}
