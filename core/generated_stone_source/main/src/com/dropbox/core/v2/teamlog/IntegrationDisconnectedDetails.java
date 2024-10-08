/* DO NOT EDIT */
/* This file was generated from team_log_generated.stone */

package com.dropbox.core.v2.teamlog;

import com.dropbox.core.stone.StoneDeserializerLogger;
import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.util.Arrays;

/**
 * Disconnected integration for member.
 */
public class IntegrationDisconnectedDetails {
    // struct team_log.IntegrationDisconnectedDetails (team_log_generated.stone)

    protected final String integrationName;

    /**
     * Disconnected integration for member.
     *
     * @param integrationName  Name of the third-party integration. Must not be
     *     {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public IntegrationDisconnectedDetails(String integrationName) {
        if (integrationName == null) {
            throw new IllegalArgumentException("Required value for 'integrationName' is null");
        }
        this.integrationName = integrationName;
    }

    /**
     * Name of the third-party integration.
     *
     * @return value for this field, never {@code null}.
     */
    public String getIntegrationName() {
        return integrationName;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            integrationName
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            IntegrationDisconnectedDetails other = (IntegrationDisconnectedDetails) obj;
            return (this.integrationName == other.integrationName) || (this.integrationName.equals(other.integrationName));
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static class Serializer extends StructSerializer<IntegrationDisconnectedDetails> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(IntegrationDisconnectedDetails value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("integration_name");
            StoneSerializers.string().serialize(value.integrationName, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public IntegrationDisconnectedDetails deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            IntegrationDisconnectedDetails value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                String f_integrationName = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("integration_name".equals(field)) {
                        f_integrationName = StoneSerializers.string().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_integrationName == null) {
                    throw new JsonParseException(p, "Required field \"integration_name\" missing.");
                }
                value = new IntegrationDisconnectedDetails(f_integrationName);
            }
            else {
                throw new JsonParseException(p, "No subtype found that matches tag: \"" + tag + "\"");
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            StoneDeserializerLogger.log(value, value.toStringMultiline());
            return value;
        }
    }
}
