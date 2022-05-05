
    class Persona {
        //Atributos
        #nombre = "";
        #edad = 0;
        #correo = "";
        #id = 0;
        static #contador = 0;
    
        constructor(nombre, edad, correo) {
            this.#nombre = nombre;
            this.#edad = edad;
            this.#correo = correo;
            this.#id = ++Persona.#contador;
        }
    
        //Metodos
        /**
         * Los métodos en JavaScript los getters y setters se usan como atributos privados
         * @returns {string}
         */
        get getNombre() {
            return this.#nombre;
        }
    
        /**
         * Obtener edad
         * @returns {number}
         */
        get getEdad() {
            return this.#edad;
        }
    
        /**
         * Obtener correo
         * @returns {string}
         */
        get getCorreo() {
            return this.#correo;
        }
    
        /**
         * Configurar o fijar el nombre
         * @param {string} nombre Nombre de la persona
         */
        set setNombre(nombre) {
            this.#nombre = nombre;
        }
    
        /**
         * Configurar la edad
         * @param {number} edad Edad de la persona
         */
        set setEdad(edad) {
            this.#edad = edad;
        }
    
        /**
         * Nos permite configurar o fijar el correo
         * @param {string} correo Correo de la persona
         */
        set setCorreo(correo) {
            this.#correo = correo;
        }
    
        /**
         * Es un método privado, no se puede llamar desde el exterior, solo desde
         * otro método contenido en la clase padre
         * @returns {string} Retorna un mensaje de saludo
         */
        #saludar() {
            let mensaje = `Hola, me llamo ${this.#nombre} y tengo ${this.#edad} años`;
            const template = `<p>${mensaje}</p>`;
            const div = document.getElementById("saludo");
            div.innerHTML = template;
            div.style.color = "orange";
            div.style.fontSize = "20px";
            div.style.fontWeight = "bold";
            div.style.textAlign = "center";
            div.style.padding = "10px";
            div.style.border = "1px solid #ccc";
            div.style.borderRadius = "10px";
            div.style.backgroundColor = "whitesmoke";
            div.style.margin = "10px";
            div.style.width = "20rem";
            div.style.justifyContent = "center";
            div.style.alignItems = "center";
            div.style.flexDirection = "column";
            div.style.boxShadow = "0px 0px 10px #ccc";
            div.style.position = "relative";
            div.style.top = "50px";
            div.style.left = "50px";
            div.style.transform = "rotate(20deg)";
            div.style.transition = "0.8s";
            return template;
        }
    
        mostrarSaludo() {
            return this.#saludar();
        }
    
        static mostrarContador() {
            return `El contador está en: ${Persona.#contador}`;
        }
    }
    
    const persona1 = new Persona('Adolf', 30, 'adolf@algo.com.mx');
    persona1.mostrarSaludo();
    
    //console.log(persona1);
    
    //persona1.#nombre = 'Adolfo'; //No se puede acceder a los atributos privados
    persona1.setNombre = 'Adolfo'; //Se puede acceder a los atributos privados
    persona1.setEdad = 25;
    persona1.setCorreo = 'adolf@example.com';
    const persona2 = new Persona('adolf', 30, 'adolf@algo.com.mx');
    const persona3 = new Persona('Mario', 30, 'cancer@algo.com.mx');
    console.log(persona1);
    console.log(persona2);
    console.log(persona2);
    
    console.log(Persona.contador);