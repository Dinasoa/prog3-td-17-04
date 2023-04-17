package com.example.exo.ConcreteClass;

import com.example.exo.AbstractClass.AbstractClass1;
import com.example.exo.ConcreteDependance.ConcreteDependance1;
import com.example.exo.ConcreteDependance.ConcreteDependance2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass1{
  public ConcreteClass2(ConcreteDependance1 concreteClass1, ConcreteDependance2 concreteClass2) {
    super(concreteClass1, concreteClass2);
  }
}
