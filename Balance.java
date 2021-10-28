public class Balance {


    int r = 0, l = 0;


        void addRight ( int n ){ //Правая чаша весов (метод не возвращает)
            r += n;
            System.out.println("Правая чаша весов");
        }

        void addLeft ( int n){ //Левая чаша весов (метод не возвращает)
            l += n;
        }

        String getSituation () {
            if (r == l)
                return "="; //Добавляем метод (if если) пишим return(вернуть)  Метод верен (=) если вес на обеих чашах равен
            else if (r > l) return "r"; //Пишем метод (else if)  На правой больше
            else return "l"; //  На левой больше

        }


}

