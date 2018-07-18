package com.bobo.decoration;

/**
 * Created by bobo.dou on 2018/7/16 16:12
 * 装饰的类
 */
public class Decorator extends Component {


    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void opreation() {
        if (component != null){
            component.opreation();
        }
    }
}
