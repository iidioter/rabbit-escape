package rabbitescape.engine;

import java.util.Map;

import rabbitescape.engine.ChangeDescription.State;

public abstract class Behaviour
{
    public boolean triggered;

    public abstract State newState(
        Rabbit rabbit, World world, boolean triggered );

    public abstract boolean behave( World world, Rabbit rabbit, State state );
    public abstract boolean checkTriggered( Rabbit rabbit, World world );

    public void saveState( Map<String, String> saveState )
    {
    }
    public void restoreFromState( Map<String, String> saveState )
    {
    }
}
