window.onload = () => {
    fetch('https://jsonplaceholder.typicode.com/albums/1/photos')
    .then(resp=>resp.json().then(data=>{
        console.log(data)
        for(i=0; i<data.length; i++){
            console.log(data[i].url)
            console.log(data[i].title)
             
        }
        
    }))
  };