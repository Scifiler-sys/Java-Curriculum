import { useEffect, useState } from "react";

interface IProps {
    type:string,
    label:string,
    value:any
}

function Input(props: IProps) {
    
    const [value, setValue] = useState<any>();

    useEffect(() => {
        setValue(props.value);
    }, [])

    function onChange(e: React.ChangeEvent<HTMLInputElement>) {

        if (typeof value == "number") {
            setValue(+e.target.value);
        }
        else {
            setValue(e.target.value);
        }


    }

    return <div>
        <label>{props.label}</label>
        <input type={props.type} onChange={onChange}></input>
    </div>
}

export default Input;