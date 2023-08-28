package dat250;
import io.javalin.Javalin;

public class App {

    private static final String WEBPAGE = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Convert units</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h1>Unit converter</h1>\n" +
            "<form action=\"/convert\" method=\"post\">\n" +
            "    <fieldset>\n" +
            "    <label for=\"val\">Value:</label>" +
            "    <input id=\"val\" type=\"text\" name=\"value\"><br />\n" +
            "    <label for=\"source-unit\">From unit:</label>\n" +
            "    <select name=\"sunit\" id=\"source-unit\">\n" +
            "        <option value=\"in\">Inches</option>\n" +
            "        <option value=\"ft\">Feet</option>\n" +
            "        <option value=\"mi\">Miles</option>\n" +
            "        <option value=\"m\">Metres</option>\n" +
            "    </select><br />\n" +
            "    <label for=\"target-unit\">To unit:</label>\n" +
            "    <select name=\"tunit\" id=\"target-unit\">\n" +
            "        <option value=\"in\">Inches</option>\n" +
            "        <option value=\"ft\">Feet</option>\n" +
            "        <option value=\"mi\">Miles</option>\n" +
            "        <option value=\"m\">Metres</option>\n" +
            "    </select><br />\n" +
            "    <input type=\"submit\" value=\"Calculate\" />\n" +
            "    </fieldset>\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    public static final double IN_TO_METER = 0.0254;
    public static final double FT_TO_METER = 0.3048;
    public static final double MI_TO_METER = 1609.344;


    public static void main(String[] args) {
        Javalin.create()
                .get("/", ctx -> {
                    ctx.html(WEBPAGE);
                })
                .post("/convert", ctx -> {
                    double value = Double.parseDouble(ctx.formParam("value"));
                    String fromUnit = ctx.formParam("sunit");
                    String toUnit = ctx.formParam("tunit");
                    double result = convertUnits(fromUnit, toUnit, value);
                    ctx.result(Double.toString(result));
                })
                .start(9000);
    }

    public static double convertUnits(String fromUnit, String toUnit, double value) {
        double conversionFactor;

        if (fromUnit.equals("in")) {
            if (toUnit.equals("m")) {
                conversionFactor = IN_TO_METER;
            } else if (toUnit.equals("ft")) {
                conversionFactor = IN_TO_METER / FT_TO_METER;
            } else if (toUnit.equals("mi")) {
                conversionFactor = IN_TO_METER / MI_TO_METER;
            } else {
                conversionFactor = 1.0; // Same unit, no conversion needed
            }
        } else if (fromUnit.equals("ft")) {
            if (toUnit.equals("m")) {
                conversionFactor = FT_TO_METER;
            } else if (toUnit.equals("in")) {
                conversionFactor = FT_TO_METER / IN_TO_METER;
            } else if (toUnit.equals("mi")) {
                conversionFactor = FT_TO_METER / MI_TO_METER;
            } else {
                conversionFactor = 1.0; // Same unit, no conversion needed
            }
        } else if (fromUnit.equals("mi")) {
            if (toUnit.equals("m")) {
                conversionFactor = MI_TO_METER;
            } else if (toUnit.equals("in")) {
                conversionFactor = MI_TO_METER / IN_TO_METER;
            } else if (toUnit.equals("ft")) {
                conversionFactor = MI_TO_METER / FT_TO_METER;
            } else {
                conversionFactor = 1.0; // Same unit, no conversion needed
            }
        } else if (fromUnit.equals("m")) {
            if (toUnit.equals("in")) {
                conversionFactor = 1.0 / IN_TO_METER;
            } else if (toUnit.equals("ft")) {
                conversionFactor = 1.0 / FT_TO_METER;
            } else if (toUnit.equals("mi")) {
                conversionFactor = 1.0 / MI_TO_METER;
            } else {
                conversionFactor = 1.0; // Same unit, no conversion needed
            }
        } else {
            conversionFactor = Double.NaN; // Unknown unit, no conversion possible
        }

        return value * conversionFactor;
    }
}