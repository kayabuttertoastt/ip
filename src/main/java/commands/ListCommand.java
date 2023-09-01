package commands;

import storage.Storage;
import tasks.TaskList;
import ui.Ui;

public class ListCommand extends Command{
    @Override
    public boolean isExit() {
        return false;
    }
    @Override
    public void execute(TaskList tasksList, Ui ui, Storage storage) {
            ui.showList(tasksList);
    }
}
