import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce iaculis pretium mauris quis placerat. Aenean luctus sagittis tortor quis molestie. Vestibulum auctor tincidunt ex in efficitur. Morbi odio quam, pharetra nec lacus ac, facilisis vulputate nunc. Nam nec dolor nunc. Quisque scelerisque arcu eget arcu fringilla mollis. Mauris euismod, tortor ac sagittis aliquam, erat lacus pharetra felis, a gravida augue lacus in elit. Vestibulum pulvinar tempus volutpat. Nam id mattis tortor. Vestibulum quam tellus, condimentum eu viverra in, finibus eget elit. Vivamus pretium dolor metus, laoreet bibendum leo facilisis id. Donec accumsan cursus varius. Donec nec purus at tortor elementum condimentum. Pellentesque nisl velit, varius vitae suscipit at, bibendum convallis felis. Proin pulvinar sapien eu pulvinar ullamcorper. Sed gravida ultricies enim, in hendrerit ex pharetra at. Nunc tempor efficitur mauris, nec lobortis ante rhoncus et. Aliquam erat volutpat. Donec eget varius leo. Integer blandit elit vel est porta porta. Aliquam non diam ligula. Fusce ante mi, mattis quis ornare vitae, varius a massa. Curabitur varius interdum malesuada. Etiam quis facilisis ex, eu eleifend arcu. Sed et sem vestibulum, eleifend mauris vel, laoreet purus. Ut auctor at arcu ac vulputate. Etiam at metus sapien. Phasellus nec nunc ullamcorper, aliquam tortor vel, tempor dolor. Sed nec mauris molestie, vehicula nibh non, faucibus libero. Duis facilisis mollis arcu, non varius felis consectetur non. Etiam non nisi lacus. Integer in neque dapibus, mollis enim lobortis, posuere est. Quisque eleifend lobortis arcu, vitae imperdiet tellus feugiat a. In eget iaculis erat, scelerisque ullamcorper neque. Integer blandit ultrices turpis, eu varius ipsum. Nam eu tempor diam. In hac habitasse platea dictumst. In iaculis sem id lacus iaculis rhoncus. Quisque vitae viverra diam, sit amet interdum augue. In eu ornare ipsum. Vestibulum cursus odio quis sapien vulputate porta. Mauris molestie pharetra nisi non eleifend. Nunc vel nisi sodales, condimentum ipsum vel, pulvinar sapien. Donec ultrices, ante et varius sodales, felis sem hendrerit felis, id mollis lectus libero nec mi. Cras tempus fermentum metus, sed faucibus orci sagittis ultrices. Nam scelerisque gravida interdum. Nulla facilisi. Sed eget nibh lorem. Duis finibus vitae dolor id interdum. Nam justo tortor, euismod quis sapien at, molestie mollis enim. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.";

        String[] a = s.split("\\W+");

        HashMap<String, Integer> map = new HashMap();

        for (String e : a) {
            if (map.get(e) == null) map.put(e, 1);
            else map.put(e, map.get(e) + 1);
        }

        for (HashMap.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue()>4)
                System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
