package teapot.pga;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class SumModel extends FileModel {
    private long files = 0;
    public void countfiles() {
        this.files ++;
    }
    @Override
    public void add(FileModel model) {
        this.countfiles();
        super.add(model);
    }
}
