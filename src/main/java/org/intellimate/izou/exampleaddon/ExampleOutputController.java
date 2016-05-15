package org.intellimate.izou.exampleaddon;

import org.intellimate.izou.sdk.Context;
import org.intellimate.izou.sdk.output.OutputController;

/**
 * <p>
 *     An example of an {@link OutputController}.
 * </p>
 *
 * @author Julian Brendl
 */
public class ExampleOutputController extends OutputController {
    public static String ID = ExampleOutputController.class.getCanonicalName();

    /**
     * Creates a new ExampleOutputController with the context of the addOn.
     *
     * @param context The context of the addOn.
     */
    public ExampleOutputController(Context context) {
        super(context, ID);
    }

    @Override
    public boolean turnOn() {
        return false;
    }

    @Override
    public boolean turnOff() {
        return false;
    }
}
