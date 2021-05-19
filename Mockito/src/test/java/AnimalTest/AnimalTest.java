package AnimalTest;

import org.junit.jupiter.api.Test;
import Animal.Animal;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AnimalTest {

    @Test
    public void mockTest(){
        Animal animal = mock(Animal.class);

        assertTrue(animal != null);

        when(animal.getAge()).thenReturn(23);
        when(animal.getName()).thenReturn("호랑이");
        when(animal.getFly()).thenReturn(true);

        assertTrue(animal.getAge() == 23);
        assertTrue(animal.getName().equals("호랑이"));
        assertTrue(animal.getFly() == true);
    }

    @Test
    public void mockTest2() {
        Animal animal = mock(Animal.class);

        List<String> animalList = new ArrayList<>();
        animalList.add("호랑이");
        animalList.add("늑대");
        animalList.add("악어");

        when(animal.getAnimalList()).thenReturn(animalList);

        assertNotNull(animalList);
        assertEquals(animalList.size(), 3);

        System.out.println(animal.getAnimalList().get(1));
    }

    @Test
    public void mockTest3() {
        Animal animal = mock(Animal.class);

        doThrow(new RuntimeException()).when(animal).setAge(eq(30));
        animal.setAge(23);
    }

    @Test
    public void mockTest4() {
        Animal animal = mock(Animal.class);

        animal.setName("악어");

        verify(animal, times(1)).setName(any(String.class));
        verify(animal, never()).getName();
        verify(animal, never()).setName(eq("호랑이"));
        verify(animal, never()).setName(eq("악어"));

        verify(animal, atLeastOnce()).setName(any(String.class));

        verify(animal, atMost(2)).setName(any(String.class));
        verify(animal, atLeast(2)).setName(any(String.class)); // fail

        verify(animal, timeout(100)).setName(any(String.class));
        verify(animal, timeout(100).atLeast(1)).setName(any(String.class));
    }


}
